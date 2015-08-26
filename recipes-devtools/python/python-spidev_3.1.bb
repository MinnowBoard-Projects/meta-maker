SUMMARY = "Python module to interface with the spidev device on Linux"
HOMEPAGE = "https://pypi.python.org/pypi/spidev"
SECTION = "devel/python"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=9553bcad7e6f46f09eca6405d92a4f58"

PR = "r0"
SRCNAME = "spidev"

SRC_URI = "http://pypi.python.org/packages/source/s/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "fe9146030263c62858051f3485afa313"
SRC_URI[sha256sum] = "355391e9ad3024950590626b080324394c12e75bb21923dbd56a978a1eac6ac7"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

DEPENDS += "libffi"

RDEPENDS_${PN} += "python-core"

