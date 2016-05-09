DESCRIPTION = "Minnowboard MAX maker project repository"
PR = "r0"
LICENSE= "MIT"
LIC_FILES_CHKSUM = "file://maker/LICENSE;md5=c07d4c0b0db8232869dd2c16340c13f2"

SRC_URI = "http://github.com/MinnowBoard/minnow-maker.git""

SRC_URI[md5sum] = "d42594a985f063c065ad7acf06663f9f"
SRC_URI[sha256sum] = "6f7687bef4eedf6d4caf8ef385eed69f5f3f038b10cd3b229145ccd70359c94f"

FILES_${PN} += " \
                /home/root/* \
                "
S = "${WORKDIR}"

DEPENDS_${PN}-dev = ""
ALLOW_EMPTY_${PN} = "1"

do_fetch(){
    rm -rf ${S}/maker
    git clone http://github.com/MinnowBoard/minnow-maker.git" ${S}/maker
}

do_install(){
    install -d ${D}/home/root/
    cp -r ${WORKDIR}/maker ${D}/home/root/
}

do_unpack[noexec]= "1"
