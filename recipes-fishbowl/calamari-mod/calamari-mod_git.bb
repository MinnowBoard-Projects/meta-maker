SUMMARY = "MinnowBoard Calamari Lure Boardfile"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://calamari.c;md5=f791a00e620ae4c95d90ec31d7a536b3"

inherit module

KERNEL_MODULE_AUTOLOAD += "calamari"

SRC_URI = "git://github.com/MinnowBoard/minnow-max-extras.git;protocol=https\
           file://calamari.conf"
SRCREV = "cb5eb6640ded44d432e69b7378007e471cbe1206"

S = "${WORKDIR}/git/modules/calamari"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

do_install_append() {
	install -d ${D}/etc/modprobe.d
	install -m 0755 ${WORKDIR}/calamari.conf ${D}/etc/modprobe.d/calamari.conf
}

FILES_$PN += "/etc/modprobe.d"
