DESCRIPTION = "The nmea_msgs package contains messages related to data in the NMEA format."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4d05c25209966653c045fec8450c4ccb"
SRC_URI[sha256sum] = "ddeb8fe2c3505905d53aa2bea1d2ee9b4b97c42daf6b9bd03e27fb1f25c6e3db"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

DEPENDS += " \
    message-generation \
    std-msgs \
"
RDEPENDS_${PN} += " \
    message-runtime \
    std-msgs \
"
