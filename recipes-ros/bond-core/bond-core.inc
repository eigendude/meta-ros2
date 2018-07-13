SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "429c2825a19ac8941bfb48772e29bf7e"
SRC_URI[sha256sum] = "9c7498b08c7c6a472932e74451541204ec05b206c58c25a5ad1de0596d071583"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "bond_core"

SRC_URI += "file://0001-Argument-to-Boost-Milliseconds-must-be-integral-in-B.patch;patchdir=.."
