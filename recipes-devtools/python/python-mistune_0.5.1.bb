SUMMARY = "The fastest markdown parser in pure Python"
SECTION = "devel/python"
LICENSE = "BSD"
HOMEPAGE = "http://github.com/lepture/mistune"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6126a07066cdda07c9c4acfa8ceccd2"
SRCNAME = "mistune"

SRC_URI = "https://pypi.python.org/packages/source/m/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "10a42265bfc7e9ad817fe777a4857821"
SRC_URI[sha256sum] = "cc66489a28845c0e1848ae290af5b555074eb76185136ca058e8eed1faa89692"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools
