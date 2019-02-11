DESCRIPTION = "Connects to a GPSd server and broadcasts GPS fixes using the NavSatFix message."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " \
    gps-common \
    roscpp \
    sensor-msgs \
    libgps \
"
RDEPENDS_${PN} = " \
    gps-common \
    roscpp \
    sensor-msgs \
"

require gps-umd.inc
