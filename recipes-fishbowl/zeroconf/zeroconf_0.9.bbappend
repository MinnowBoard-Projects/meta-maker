FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://zeroconf-default \
            file://debian-zeroconf \
            file://debian-zeroconf-down"

do_install() {
	install -d ${D}${sbindir}
	install -d ${D}${sysconfdir}/network/if-up.d
	install -d ${D}${sysconfdir}/network/if-down.d
	install -d ${D}${sysconfdir}/default
	install -c -m 755 ${S}/zeroconf ${D}${sbindir}/zeroconf
	install -c -m 755 ${WORKDIR}/debian-zeroconf ${D}${sysconfdir}/network/if-up.d/00zeroconf
	install -c -m 755 ${WORKDIR}/debian-zeroconf-down ${D}${sysconfdir}/network/if-down.d/00zeroconf
	install -c ${WORKDIR}/zeroconf-default ${D}${sysconfdir}/default/zeroconf
}
