DESCRIPTION = "Kobuki message and service types: custom messages and services for Kobuki packages."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs actionlib-msgs message-generation"

SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "618e1d770aac86580d82b4572acbaa6e"
SRC_URI[sha256sum] = "577e63e80fe42a64078e424890b227a15dbbcf0a0cc423336d5d6f503890a2ee"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
