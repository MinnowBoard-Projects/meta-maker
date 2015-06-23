SUMMARY = "Python web framework and asynchronous networking library."
SECTION = "devel/python"
LICENSE = "Apache-2.0"
HOMEPAGE = "http://www.tornadoweb.org/"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=175530f708ad15c556642b5930457fcf"
SRCNAME = "tornado"

SRC_URI = "https://pypi.python.org/packages/source/t/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "a06ea343375f2247344257ef691641f9"
SRC_URI[sha256sum] = "99abd3aede45c93739346ee7384e710120121c3744da155d5cff1c0101702228"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-backports-ssl-match-hostname python-certifi"
