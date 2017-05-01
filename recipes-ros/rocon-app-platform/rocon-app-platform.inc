SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "033d2b82e1add8cb2b6de94db619f4a8"
SRC_URI[sha256sum] = "e3bc8cd00f4e2fb80d3b2f82c4bc7ab1d53f3844a9089655d2d979254549d96e"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rocon_app_platform"
