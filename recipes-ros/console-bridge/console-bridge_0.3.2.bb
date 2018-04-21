DESCRIPTION = "console_bridge is a ROS-independent, pure CMake package that provides logging \
calls that mirror those found in rosconsole, but for applications that are not necessarily using \
ROS."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "\
    file://include/console_bridge/console.h;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
    file://src/console.cpp;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
"

DEPENDS = "boost"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6c525353efe6f386fa25d58eafa72869"
SRC_URI[sha256sum] = "fd12e48c672cb9c5d516d90429c4a7ad605859583fc23d98258c3fa7a12d89f4"

S = "${WORKDIR}/${ROS_SP}"

inherit cmake ros

FILES_${PN}-dev += "${libdir}/${ROS_BPN}/cmake"
