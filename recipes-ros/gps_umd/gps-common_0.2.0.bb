DESCRIPTION = "GPS messages and common routines for use in GPS drivers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation \
    message-filters \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
"
RDEPENDS_${PN} = "message-filters \
    message-runtime \
    nav-msgs \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
"

require gps-umd.inc
