SUMMARY = "Python parser for the C language"
HOMEPAGE = "http://github.com/eliben/pycparser"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=cf2bb13442c2a27524fef4c0d5b6332f"

PR = "r0"
SRCNAME = "pycparser"

SRC_URI = "http://pypi.python.org/packages/source/p/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "a2bc8d28c923b4fe2b2c3b4b51a4f935"
SRC_URI[sha256sum] = "7959b4a74abdc27b312fed1c21e6caf9309ce0b29ea86b591fd2e99ecdf27f73"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-core"
