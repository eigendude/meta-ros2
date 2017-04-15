SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7dd5b32e717557d93dda9613c7f3128e"
SRC_URI[sha256sum] = "55f6dc2ae32b895dee3feeb434755f17d655699b3666609e66452f2e757331a2"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ros_tutorials"
