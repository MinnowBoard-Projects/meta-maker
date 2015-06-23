SUMMARY = "Run a subprocess in a pseudo terminal"
SECTION = "devel/python"
LICENSE = "ISCL"
HOMEPAGE = "http://github.com/pexpect/ptyprocess"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=e6c02086afbc95dce2a1fa56be5b2f22"
SRCNAME = "ptyprocess"

inherit distutils

S = "${WORKDIR}/${SRCNAME}-${PV}"

SRC_URI = "https://pypi.python.org/packages/source/${@SRCNAME[0]}/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "d29b8bfd7d2df4d9e4a0f87aafe59018"
SRC_URI[sha256sum] = "ddba719428afc4dd4f5eb37307ae753c81f89ea63f18e7d35bbb494a88fd49dc"
