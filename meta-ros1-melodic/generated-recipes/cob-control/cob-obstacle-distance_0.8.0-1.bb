# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The cob_obstacle_distance package"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Marco Bezzon <fxm-mb@ipa.fhg.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_control"
ROS_BPN = "cob_obstacle_distance"

ROS_BUILD_DEPENDS = " \
    assimp \
    boost \
    cmake-modules \
    cob-control-msgs \
    cob-srvs \
    dynamic-reconfigure \
    eigen-conversions \
    fcl \
    geometry-msgs \
    kdl-conversions \
    kdl-parser \
    libeigen \
    moveit-msgs \
    orocos-kdl \
    pkgconfig \
    roscpp \
    roslib \
    roslint \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    tf \
    tf-conversions \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp \
    boost \
    cmake-modules \
    cob-control-msgs \
    cob-srvs \
    dynamic-reconfigure \
    eigen-conversions \
    fcl \
    geometry-msgs \
    kdl-conversions \
    kdl-parser \
    libeigen \
    moveit-msgs \
    orocos-kdl \
    pkgconfig \
    roscpp \
    roslib \
    roslint \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    tf \
    tf-conversions \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp \
    boost \
    cmake-modules \
    cob-control-msgs \
    cob-srvs \
    dynamic-reconfigure \
    eigen-conversions \
    fcl \
    geometry-msgs \
    interactive-markers \
    joint-state-publisher \
    kdl-conversions \
    kdl-parser \
    libeigen \
    moveit-msgs \
    orocos-kdl \
    pkgconfig \
    robot-state-publisher \
    roscpp \
    roslib \
    roslint \
    rospy \
    rviz \
    sensor-msgs \
    shape-msgs \
    std-msgs \
    tf \
    tf-conversions \
    urdf \
    visualization-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_obstacle_distance/0.8.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_obstacle_distance"
SRC_URI = "git://github.com/ipa320/cob_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe3c2b26185e61de9073201d063d4a9b466ca36d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
