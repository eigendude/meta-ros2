DESCRIPTION = "The package provides the environment variables `ROS_VERSION`, `ROS_DISTRO`, `ROS_PACKAGE_PATH`, and `ROS_ETC_DIR`"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a7c9c145dfa1383c8ebbe14666660e4a"
SRC_URI[sha256sum] = "68169bfd32f29ff655c85ba238c9b635c17e57081b9abc25d9b323fbef09eff2"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
