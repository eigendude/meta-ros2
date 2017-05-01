SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "91db9592fc817ec92055ef3a6a663a1a"
SRC_URI[sha256sum] = "68900cd1c2a10ed2840c4f2b5d631fc01d949ed1429929e4477ef2da3919cd1c"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki"
