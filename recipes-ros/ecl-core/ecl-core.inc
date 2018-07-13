SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ce0adf23fdb47a59ed54ca8c05732c55"
SRC_URI[sha256sum] = "c3a2a879df4b966726fa53064d425a9e498833d54657b795e505cc4c01c1a014"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl_core"
