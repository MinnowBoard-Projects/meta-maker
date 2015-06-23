# FIXME: Surely this has already been implemented in some nice little generic
# abstraction that I just haven't found yet???

inherit distutils

S = "${WORKDIR}/${SRCNAME}-${PV}"

SRC_URI = "https://pypi.python.org/packages/source/${@SRCNAME[0]}/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

do_install_append() {
	find ${D}${PYTHON_SITEPACKAGES_DIR} -name "*.egg" | xargs -n 1 basename > ${D}${PYTHON_SITEPACKAGES_DIR}/${SRCNAME}.pth
}
