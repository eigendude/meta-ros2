# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "rospy is a pure Python client library for ROS. The rospy client     API enables Python programmers to quickly interface with ROS <a href="http://ros.org/wiki/Topics">Topics</a>, <a href="http://ros.org/wiki/Services">Services</a>, and <a href="http://ros.org/wiki/Parameter Server">Parameters</a>. The     design of rospy favors implementation speed (i.e. developer     time) over runtime performance so that algorithms can be quickly     prototyped and tested within ROS. It is also ideal for     non-critical-path code, such as configuration and initialization     code. Many of the ROS tools are written in rospy to take     advantage of the type introspection capabilities.      Many of the ROS tools, such     as <a href="http://ros.org/wiki/rostopic">rostopic</a>     and <a href="http://ros.org/wiki/rosservice">rosservice</a>, are     built on top of rospy."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Ken Conley"
HOMEPAGE = "http://ros.org/wiki/rospy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "rospy"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genpy \
    python-pyyaml \
    python-rospkg \
    roscpp \
    rosgraph \
    rosgraph-msgs \
    roslib \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genpy \
    python-pyyaml \
    python-rospkg \
    roscpp \
    rosgraph \
    rosgraph-msgs \
    roslib \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rospy/1.14.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rospy"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "7b09f9c2e391f53ca6a2662b1454fffb578e4885"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
