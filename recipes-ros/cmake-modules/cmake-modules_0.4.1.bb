DESCRIPTION = "A common repository for CMake Modules which are not \
distributed with CMake but are commonly used by ROS packages."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz \
"
SRC_URI[md5sum] = "b76b0e5a0495571a988301b638ddfd8a"
SRC_URI[sha256sum] = "1a141f44541e4b23af68166ed3dcb8c274c325be68db40399d5d8388e92e3997"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
