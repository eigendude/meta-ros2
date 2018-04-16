DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins \
using the ROS build infrastructure."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost class-loader rosconsole roslib libtinyxml2"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bd7b22d83270f56ba71808f1f852b681"
SRC_URI[sha256sum] = "60a2b6d768d22f7e92e33c93a0c3663100c4102b536cc6797c35551b8b6a3749"

inherit catkin

# libclass_loader.so: error: undefined reference to 'pthread_mutexattr_destroy', 'pthread_mutexattr_settype', 'pthread_mutexattr_init'
LDFLAGS_append = "${@bb.utils.contains('DISTRO_FEATURES', 'ld-is-gold', ' -fuse-ld=bfd ', '', d)}"
