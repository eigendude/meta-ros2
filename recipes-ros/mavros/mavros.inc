SRC_URI = "https://github.com/mavlink/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dac26bfdb33c78a0087cacb80abbbff7"
SRC_URI[sha256sum] = "067b5f3d3247367b4af9855fa537269c30b8d380a76a983e815b1a20501b2c59"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "mavros"
