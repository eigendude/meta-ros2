SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "238df4a33b40f6b63f70b5b7a6061a61"
SRC_URI[sha256sum] = "7978139086ef5006707d2f7182d4bb3ec19cbc139b80e0746291e213b046bbc4"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rocon_tools"
