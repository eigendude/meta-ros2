DESCRIPTION = "This package allows you to publish the state of a robot to tf."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f262d7ac51e6c93c7a3f8d9aa9c4c86d"
SRC_URI[sha256sum] = "8a008bcc1255643b90d3945bdfccc8efc41dd238d0820582fed0beda3e098ac6"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
