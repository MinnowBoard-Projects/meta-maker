SUMMARY = "IPv4 MinnowBoard Broadcaster"
DESCRIPTION = "Broadcast MinnowBoard IP address to the network bcast address"
#AUTHOR = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://../99minnow-broadcast;md5=787e38a2e41f473fe628727ebdef6042"
SECTION = "net"

SRC_URI = "file://99minnow-broadcast"

SRC_URI[md5sum] = ""
SRC_URI[sha256sum] = ""

do_install () {
    install -d ${D}${sysconfdir}/network/if-up.d
    install -c -m 755 ${WORKDIR}/99minnow-broadcast ${D}${sysconfdir}/network/if-up.d/99minnow-broadcast
}
