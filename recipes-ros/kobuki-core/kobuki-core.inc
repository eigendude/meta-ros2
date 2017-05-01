SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4a76c249a57b03a136f80391d9fa4f63"
SRC_URI[sha256sum] = "a50ef08c0354d5cfa1e77cad2f6d2c4e199cd19354d90abc9f594c08ad4080ed"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "kobuki_core"
