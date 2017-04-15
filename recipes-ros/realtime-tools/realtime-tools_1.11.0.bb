DESCRIPTION = "This package contains a set of tools that can be used from \
a hard realtime thread, without breaking the realtime behavior. The tools \
currently only provides the realtime publisher, which makes it possible \
to publish messages to a ROS topic from a realtime thread."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy"

SRC_URI = "https://github.com/ros-controls/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ac21028295bf0c36a608190551cd8e4f"
SRC_URI[sha256sum] = "9553239ca14f0e1af3fa3a6ed2af6710dc4d6ce934b5f859a867fbae15d8f495"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
