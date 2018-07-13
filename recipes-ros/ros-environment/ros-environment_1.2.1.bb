DESCRIPTION = "The package provides the environment variables `ROS_VERSION`, `ROS_DISTRO`, `ROS_PACKAGE_PATH`, and `ROS_ETC_DIR`"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6d794dc2c243578acf7c4dac8fadeb18"
SRC_URI[sha256sum] = "7b27acb70791779a57b082ad6e9170adbaf0a19ebde7d0aebf705210a676d39d"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
