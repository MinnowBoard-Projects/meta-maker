SUMMARY = "Terminals served to term.js using Tornado websockets"
SECTION = "devel/python"
LICENSE = "BSD"
HOMEPAGE = "http://github.com/takluyver/terminado"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=9ed3902ab8c4a4f3f4fa13f35795568b"
SRCNAME = "terminado"

SRC_URI = "https://pypi.python.org/packages/source/t/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "e992c6262a5f4c8952fee93da31a067e"
SRC_URI[sha256sum] = "63e893eff1ba84f1ee7c4bfcca7676ba1de6394538bb9aa80cbbc8866cb875b6"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

RDEPENDS_${PN} += "python-ptyprocess"
