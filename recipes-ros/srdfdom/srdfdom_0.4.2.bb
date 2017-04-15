DESCRIPTION = "Parser for Semantic Robot Description Format"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules boost urdf urdfdom-py console-bridge libtinyxml urdfdom-headers"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4cfb868d03ced518bd68ca7b19795580"
SRC_URI[sha256sum] = "19d4b91b48c39a9c3a27cb22683d91d441d74d06eb2a054667572acd09774920"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

ROS_SPN = "srdfdom"
