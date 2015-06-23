SUMMARY = "JSON Schema validation for Python"
SECTION = "devel/python"
LICENSE = "MIT"
HOMEPAGE = "http://github.com/Julian/jsonschema"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=0f6411ae89611094b475394dcd735607"
SRCNAME = "jsonschema"

SRC_URI = "https://pypi.python.org/packages/source/j/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "661f85c3d23094afbb9ac3c0673840bf"
SRC_URI[sha256sum] = "1298a2f1b2f4c4a7b921cccd159e4e42f6d7b0fb75c86c0cdecfc71f061833fa"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
