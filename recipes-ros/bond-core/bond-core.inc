SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "028ef81bedf81457bdb0ea8a370a8ddc"
SRC_URI[sha256sum] = "61e90b226ab76e9723fa5bbc9880a8eef95d6a32a008edf49da7017c82dc0abf"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "bond_core"

SRC_URI += "file://0001-Argument-to-Boost-Milliseconds-must-be-integral-in-B.patch;patchdir=.."
