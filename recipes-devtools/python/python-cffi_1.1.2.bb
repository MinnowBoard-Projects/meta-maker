SUMMARY = "Foriegn function interface for Python"
HOMEPAGE = "http://cffi.readthedocs.org/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=bba768b8cb609c4b3a4daee65fbcce99"

inherit setuptools 

PR = "r0"
SRCNAME = "cffi"

SRC_URI = "http://pypi.python.org/packages/source/c/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "ca6e6c45b45caa87aee9adc7c796eaea"
SRC_URI[sha256sum] = "390970b602708c91ddc73953bb6929e56291c18a4d80f360afa00fad8b6f3339"

S = "${WORKDIR}/${SRCNAME}-${PV}"

DEPENDS += "libffi"

RDEPENDS_${PN} += "python-core"
