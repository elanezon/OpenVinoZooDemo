SUMMARY = "Custom files"
LICENSE = "CLOSED"

SRC_URI = "file://gesture_recognition_demo.py"

S = "${WORKDIR}"

do_install() {
    install -d ${D}{bindir}
    install -m 0755 gesture_recognition_demo.py ${D}{bindir}
}