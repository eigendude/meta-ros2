SRC_URI = "https://github.com/swri-robotics/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "003a1699a10b8c177868c3cc28067560"
SRC_URI[sha256sum] = "de549789304688ca5b93ea0c3a30d45de080fa61d0e2596ae81bb0e7eefd855d"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "gps_umd"
