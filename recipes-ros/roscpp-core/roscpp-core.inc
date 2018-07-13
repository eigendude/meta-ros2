SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "13f346fc3bb65386a502f95348c308a4"
SRC_URI[sha256sum] = "1fbd5fcd79c38b3778a93b70496084c0821b22bde29b979e6091093bc98f8841"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "roscpp_core"
