SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "55b12cf74b1ea2cd387b389370bc69e3"
SRC_URI[sha256sum] = "5a42ab6fec9dc0a9f657386753fe558a4f1ef05b372084d8d6ac58512650ed59"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rocon_msgs"
