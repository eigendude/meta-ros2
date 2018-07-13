DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost shape-msgs octomap assimp libeigen qhull console-bridge random-numbers eigen-stl-containers resource-retriever visualization-msgs"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2c7042b2c8d7cbdd37003b4b59858fbc"
SRC_URI[sha256sum] = "3949ee751c01aab20984d1718e2a0ad97f9e5f5670460ff381b39ba918e4b46b"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
