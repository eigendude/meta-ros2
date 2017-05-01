SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c737d1d3e04c57f504fe500a86768269"
SRC_URI[sha256sum] = "06db32512c262c05b6b2efe060c3766b74a04267f3382749d775b4e94a32d9fc"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "rocon_multimaster"
