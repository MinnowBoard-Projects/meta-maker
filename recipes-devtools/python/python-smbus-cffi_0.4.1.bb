SUMMARY = "Python module for the I2C /dev interface on Linux"
HOMEPAGE = "https://pypi.python.org/pypi/smbus-cffi/0.1"
SECTION = "devel/python"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=b82ca760fbbffae4602fc806205daedf"

PR = "r0"
SRCNAME = "smbus-cffi"

SRC_URI = "http://pypi.python.org/packages/source/s/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "6b849ea0b68af2db6df3ad2ecb0aaffc"
SRC_URI[sha256sum] = "ed4b458d3b8cc5fc14401c8082077aab790a37d0dcb50278b0ce451e59115bb5"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

DEPENDS += "libffi"

RDEPENDS_${PN} += "python-core"

