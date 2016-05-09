SUMMARY = "Minnowboard MAX maker project files, including Adafruit GPIO and Python userspace drivers"
HOMEPAGE = "http://github.com/steelee/minnow_max_maker"
SECTION = "devel/python"
LICENSE = "MIT"

S = "${WORKDIR}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c07d4c0b0db8232869dd2c16340c13f2"

PR = "r0"
SRCNAME = "minnow_max_maker"

SRC_URI = "http://github.com/MinnowBoard/minnow-maker"

SRC_URI[md5sum] = "d42594a985f063c065ad7acf06663f9f"
SRC_URI[sha256sum] = "6f7687bef4eedf6d4caf8ef385eed69f5f3f038b10cd3b229145ccd70359c94f"

inherit setuptools

do_fetch(){
    git clone http://github.com/MinnowBoard/minnow-maker.git ${S}/python-maker
    mv ${S}/python-maker/* ${S}
    rm -rf ${S}/python-maker
}

RDEPENDS_${PN} += "python-core"

do_unpack[noexec]= "1"
