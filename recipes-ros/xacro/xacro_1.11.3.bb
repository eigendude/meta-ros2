DESCRIPTION = "Xacro is an XML macro language."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a5614eb1b02fe019db8a103ce29c063c"
SRC_URI[sha256sum] = "9c90dc674fb8ee9d89f01c030df177c6ca8e72046f946ddaa0d3eb58bc10a48d"

inherit catkin
