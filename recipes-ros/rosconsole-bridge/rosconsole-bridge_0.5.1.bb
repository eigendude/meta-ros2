DESCRIPTION = "Pipes console_bridge output to rosconsole/rosout when console_bridge is used in a ROS-dependent package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosconsole console-bridge"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b02736fdd98abf4c4a639a35d639c0d2"
SRC_URI[sha256sum] = "eeaf5826b1238b03052aebb52ac858285c9e4ade8eb0f7c4004a6af714700713"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
