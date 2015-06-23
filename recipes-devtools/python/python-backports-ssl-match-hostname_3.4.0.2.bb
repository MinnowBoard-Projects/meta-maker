SUMMARY = "The ssl.match_hostname() function from Python 3.4"
SECTION = "devel/python"
LICENSE = "PSF"
HOMEPAGE = "http://bitbucket.org/brandon/backports.ssl_match_hostname"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=77b684960b86b7a4bb4a450ffde08605"
SRCNAME = "backports.ssl_match_hostname"

SRC_URI = "https://pypi.python.org/packages/source/b/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "788214f20214c64631f0859dc79f23c6"
SRC_URI[sha256sum] = "07410e7fb09aab7bdaf5e618de66c3dac84e2e3d628352814dc4c37de321d6ae"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
