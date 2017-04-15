DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost shape-msgs octomap assimp libeigen qhull console-bridge random-numbers eigen-stl-containers resource-retriever visualization-msgs"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "391eeb246fd7fef33b7ac8f7af8a2d72"
SRC_URI[sha256sum] = "d208b45df068af94b79e5437baf271a89c0bc32b1b1ffc525d54a9453c9d51c9"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
