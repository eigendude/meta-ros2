DESCRIPTION = "This package retrieves data from url-format files such as \
http://, ftp://, package:// file://, etc., and loads the data into memory."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "curl rosconsole roslib"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0e94b9f8a9da74f52a18af9135f8ca32"
SRC_URI[sha256sum] = "936fdbcc59d72773e2950800b1ce259bf0c5e518ea64af9d37b64960b3945d46"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "${PYTHON_PN}-rospkg"
