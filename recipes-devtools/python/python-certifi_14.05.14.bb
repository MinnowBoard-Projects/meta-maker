SUMMARY = "Python package for providing Mozilla's CA Bundle."
SECTION = "devel/python"
LICENSE = "ISC"
HOMEPAGE = "http://python-requests.org/"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=9b1edbdf7dbbcef9729e1a2ab6bfd9cc"
SRCNAME = "certifi"

SRC_URI = "https://pypi.python.org/packages/source/c/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "315ea4e50673a16ab047099f816fd32a"
SRC_URI[sha256sum] = "1e1bcbacd6357c151ae37cf0290dcc809721d32ce21fd6b7339568f3ddef1b69"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
