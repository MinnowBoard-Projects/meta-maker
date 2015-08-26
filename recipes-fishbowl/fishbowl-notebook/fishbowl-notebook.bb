SUMMARY = "Start the iPython notebook at boot"
DESCRIPTION = "Start the iPython notebook at boot"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
RDEPENDS_${PN} += "ipython"

# FIXME: Move the tadpole library to it's own repo and recipe, then DEPEND on it
SRC_URI = "https://github.com/steelee/fishbowl-notebooks/archive/master.tar.gz;downloadfilename=fishbowl-notebook.tar.gz"
SRC_URI[md5sum] = "727594797aa5a8c6fc27f8dd7fc5805a"
SRC_URI[sha256sum] = "701ab22403103da746cf70ca08cbe09a60c829c0bd30044d5f2d52ca9cc4e716"

FISHBOWL_NOTEBOOKS_DIR = "/notebooks"

# As the recipe doesn't inherit systemd.bbclass, we need to set this variable
# manually to avoid unnecessary postinst/preinst generated.
python __anonymous() {
    if not bb.utils.contains('DISTRO_FEATURES', 'sysvinit', True, False, d):
        d.setVar("INHIBIT_UPDATERCD_BBCLASS", "1")
}

inherit update-rc.d
inherit python-dir

INITSCRIPT_NAME = "fishbowl"
INITSCRIPT_PARAMS = "defaults 99"
S = "${WORKDIR}/fishbowl-notebooks-master"

do_install() {
	# Only install the init script when 'sysvinit' is in DISTRO_FEATURES.
	if ${@bb.utils.contains('DISTRO_FEATURES','sysvinit','true','false',d)}; then
		install -d ${D}${sysconfdir}/init.d
		install -m 0755 ${S}/fishbowl ${D}${sysconfdir}/init.d/fishbowl
	fi
	install -d ${D}${FISHBOWL_NOTEBOOKS_DIR}
	install -m 0755 ${S}/*.ipynb ${D}${FISHBOWL_NOTEBOOKS_DIR}
	install -m 0755 ${S}/*.png ${D}${FISHBOWL_NOTEBOOKS_DIR}

	install -d ${D}${PYTHON_SITEPACKAGES_DIR}
	install -m 0755 ${S}/*.py ${D}${PYTHON_SITEPACKAGES_DIR}

	install -d ${D}${bindir}
	install -m 0755 ${S}/broadcast_ip.py ${D}${bindir}/broadcast_ip.py

	install -d ${D}/home/root
	install -m 0755 ${S}/pythonrc ${D}/home/root/.pythonrc
	
	cp -r ${S}/ipython ${D}/home/root/.ipython

}

pkg_postinst_${PN} (){
	#!/bin/sh
	# post-install symbolic link
	ln -s  /etc/init.d/fishbowl /usr/bin/fishbowl 
}

FILES_${PN} = "${sysconfdir}/init.d ${FISHBOWL_NOTEBOOKS_DIR} ${bindir} /home/root ${PYTHON_SITEPACKAGES_DIR}"
