DESCRIPTION = "Package to parse NMEA strings and publish a very simple GPS message. Does not require or use the GPSD deamon."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros-drivers/${ROS_SPN}/archive/${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ce3a81bebd6ac4a1e4b9886a7fea4cc4"
SRC_URI[sha256sum] = "7178568b7ee197101a644d2c8fb47a1e84d39a6e199526090e5130c3aeab12c0"

S = "${WORKDIR}/${ROS_SPN}-${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = " \
    geometry-msgs \
    nmea-msgs \
    python-pyserial \
    rospy \
    sensor-msgs \
"
