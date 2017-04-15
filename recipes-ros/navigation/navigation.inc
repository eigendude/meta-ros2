SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "163eb4065bb8c76ad7e334502383e668"
SRC_URI[sha256sum] = "b8be76079876ff866bce634caf862f1e2fd8e017d82c207b6aed27ca94cf0f6c"

SRC_URI += "file://0001-amcl-fix-compilation-with-gcc-v7.patch;patchdir=.."

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "navigation"
