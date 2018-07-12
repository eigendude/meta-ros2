DESCRIPTION = "Low-level build system macros and infrastructure for ROS"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake ${PYTHON_PN}-empy-native ${PYTHON_PN}-catkin-pkg-native"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9fa68200ba615face09994c7842b8b4b"
SRC_URI[sha256sum] = "48ae4695b7424e3da896ae5794b013b635ca8fb8f122b77033bbb548d0e29ab5"

SRC_URI += "\
    file://0001-use-python-provided-by-environment-instead-of-the-ge.patch \
    file://0001-allow-proper-cross-compilation-with-catkin.patch \
    ${@'file://0001-python.cmake-look-for-python3-first.patch' if d.getVar('PYTHON_PN', True) == 'python3' else ''} \
    "

inherit catkin
