DESCRIPTION = "ROS console output library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apr boost cpp-common log4cxx rostime rosunit"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2f3f23a28fc639b84b83a3b9856fefd7"
SRC_URI[sha256sum] = "8d99a6570d642aba7e0c1ef2175bc86a6620c3bee993435da006ce1fd3919c9a"

inherit catkin
