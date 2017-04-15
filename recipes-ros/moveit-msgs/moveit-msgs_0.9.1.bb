DESCRIPTION = "Messages, services and actions used by MoveIt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation std-msgs trajectory-msgs geometry-msgs sensor-msgs actionlib-msgs octomap-msgs object-recognition-msgs"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f570f2c0a0111fc7b5e234baa5bd3cb6"
SRC_URI[sha256sum] = "49d5980e1ff4a4fb606eee079632de5360bbee71e8e8897076be5f619add7428"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
